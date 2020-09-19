package io.rheem.sqlite3.plugin;

import io.rheem.core.api.Configuration;
import io.rheem.core.mapping.Mapping;
import io.rheem.core.optimizer.channels.ChannelConversion;
import io.rheem.core.plan.rheemplan.Operator;
import io.rheem.core.platform.Platform;
import io.rheem.core.plugin.Plugin;
import io.rheem.java.platform.JavaPlatform;
import io.rheem.sqlite3.channels.ChannelConversions;
import io.rheem.sqlite3.mapping.Mappings;
import io.rheem.sqlite3.platform.Sqlite3Platform;

import java.util.Arrays;
import java.util.Collection;

/**
 * This {@link Plugin} enables to use some basic Rheem {@link Operator}s on the {@link Sqlite3Platform}.
 */
public class Sqlite3Plugin implements Plugin {

    @Override
    public Collection<Platform> getRequiredPlatforms() {
        return Arrays.asList(Sqlite3Platform.getInstance(), JavaPlatform.getInstance());
    }

    @Override
    public Collection<Mapping> getMappings() {
        return Mappings.ALL;
    }

    @Override
    public Collection<ChannelConversion> getChannelConversions() {
        return ChannelConversions.ALL;
    }

    @Override
    public void setProperties(Configuration configuration) {
    }
}
