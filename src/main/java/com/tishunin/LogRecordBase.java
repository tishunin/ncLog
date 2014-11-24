package com.tishunin;

import java.time.LocalTime;

/**
 Содержит информацию о регистрируемом событии
  */
public class LogRecordBase implements LogRecord
{
	String message;
	LogLevel logLevel;
	LocalTime eventTime;
	int threadId;
	
	public LogRecordBase(LogLevel loglevel,int threadId,String message)
	{
		this.threadId = threadId;
		this.eventTime = LocalTime.now();
		this.message = message;
		this.logLevel = loglevel;
	}
	
	@Override
	public LocalTime getEventTime()
	{
		return this.eventTime;
	}

	@Override
	public int getThreadid() 
	{
		return this.threadId;
	}

	@Override
	public LogLevel getLogLevel() 
	{
		return this.logLevel;
	}

	@Override
	public String getMessage() 
	{
		return this.message;
	}
	
}
