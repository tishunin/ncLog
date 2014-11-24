package com.tishunin;

public interface Handler
{
	Formatter getFormatter();
	void setFormatter(Formatter formatter);
	void handleRecord(LogRecord record);
}
