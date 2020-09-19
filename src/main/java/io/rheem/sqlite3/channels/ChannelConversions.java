package io.rheem.sqlite3.channels;

import io.rheem.core.optimizer.channels.ChannelConversion;
import io.rheem.core.optimizer.channels.DefaultChannelConversion;
import io.rheem.java.channels.StreamChannel;
import io.rheem.jdbc.operators.SqlToStreamOperator;
import io.rheem.sqlite3.platform.Sqlite3Platform;

import java.util.Collection;
import java.util.Collections;

/**
 * Register for the {@link ChannelConversion}s supported for this platform.
 */
public class ChannelConversions {

    public static final ChannelConversion SQL_TO_STREAM_CONVERSION = new DefaultChannelConversion(
            Sqlite3Platform.getInstance().getSqlQueryChannelDescriptor(),
            StreamChannel.DESCRIPTOR,
            () -> new SqlToStreamOperator(Sqlite3Platform.getInstance())
    );

    public static final Collection<ChannelConversion> ALL = Collections.singleton(
            SQL_TO_STREAM_CONVERSION
    );

}
