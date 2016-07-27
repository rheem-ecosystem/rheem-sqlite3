package org.qcri.rheem.sqlite3.operators;

import org.qcri.rheem.basic.operators.TableSource;
import org.qcri.rheem.core.platform.ChannelDescriptor;
import org.qcri.rheem.jdbc.operators.JdbcTableSource;
import org.qcri.rheem.sqlite3.Sqlite3Platform;

import java.util.Collections;
import java.util.List;

/**
 * Implementation of the {@link TableSource} for the {@link Sqlite3Platform}.
 */
public class Sqlite3TableSource extends JdbcTableSource {

    public Sqlite3TableSource(String tableName) {
        super(tableName);
    }

    public Sqlite3TableSource(Sqlite3TableSource that) {
        super(that);
    }

    @Override
    public Sqlite3Platform getPlatform() {
        return Sqlite3Platform.getInstance();
    }

    @Override
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        throw new UnsupportedOperationException("Input channels are not supported.");
    }

    @Override
    public List<ChannelDescriptor> getSupportedOutputChannels(int index) {
        assert index == 0;
        return Collections.singletonList(this.getPlatform().getSqlQueryChannelDescriptor());
    }

}
