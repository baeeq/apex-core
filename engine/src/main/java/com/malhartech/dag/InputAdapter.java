/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.dag;

/**
 *
 * @author Chetan Narsude <chetan@malhar-inc.com>
 */
public interface InputAdapter extends Stream
{
  /**
   * corresponds to 2^14 - 1 =>  maximum bytes needed for varint encoding is 2.
   */
  public static final int MAX_VALUE_WINDOW = 0x3fff;
  
  /**
   * A Sample out of range window value which can be used by applications to denote Invalid Window ID.
   */
  public static final int OUT_OF_RANGE_WINDOW = 0xffff;

  public boolean hasFinished();

  public void resetWindow(int baseSeconds);

  public void beginWindow(int windowId);

  public void endWindow(int windowId);
}
