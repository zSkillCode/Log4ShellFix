package dev.vengine.log4shellfix;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.message.Message;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

public class Log4ShellFix extends JavaPlugin {

    @Override
    public void onEnable() {

        final Logger logger = (Logger) LogManager.getRootLogger();
        logger.addFilter(new Filter() {
            @Override
            public Result getOnMismatch() {
                return null;
            }

            @Override
            public Result getOnMatch() {
                return null;
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object... objects) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2, final Object o3) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2, final Object o3, final Object o4) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final String s, final Object o, final Object o1, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9) {
                return check(s);
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final Object o, final Throwable throwable) {
                return check(o.toString());
            }

            @Override
            public Result filter(final Logger logger, final Level level, final Marker marker, final Message message, final Throwable throwable) {
                return check(message.getFormattedMessage());
            }

            @Override
            public Result filter(final LogEvent logEvent) {
                return check(logEvent.getMessage().getFormattedMessage());
            }

            @Override
            public State getState() {
                return State.STARTED;
            }

            @Override
            public void initialize() {

            }

            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public boolean isStarted() {
                return true;
            }

            @Override
            public boolean isStopped() {
                return false;
            }
        });
    }

    private Filter.Result check(final String message) {
        return message.toLowerCase(Locale.ROOT).contains("${jndi") ? Filter.Result.DENY : Filter.Result.NEUTRAL;
    }

}
