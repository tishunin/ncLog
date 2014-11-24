/**
 * 
 */
package com.tishunin;

import java.time.LocalTime;

/**
 * @author Yury Tishunin
 *
 */
public interface LogRecord 
{
	LocalTime getEventTime();
	int getThreadid();
	LogLevel getLogLevel();
	String getMessage();
}

