/**
 * 
 */
package com.tishunin;

/**
 * @author Yury Tishunin
 *
 */
public abstract class HandlerBase implements Handler 
{
	public HandlerBase(Formatter formatter)
	{
		this.formatter = formatter;
	}
	
	public HandlerBase()
	{
		
	}
	
	Formatter formatter;
	/* (non-Javadoc)
	 * @see com.tishunin.Handler#getFormatter()
	 */
	@Override
	public Formatter getFormatter() 
	{
		return this.formatter;
	}

	/* (non-Javadoc)
	 * @see com.tishunin.Handler#setFormatter(com.tishunin.Formatter)
	 */
	@Override
	public void setFormatter(Formatter formatter) 
	{
		this.formatter = formatter;
	}

	/* (non-Javadoc)
	 * @see com.tishunin.Handler#handleRecord(com.tishunin.LogRecord)
	 */
	@Override
	public abstract void handleRecord(LogRecord record);
}
