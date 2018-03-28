package com.lbl.codek3demo.blnetwork;

/**
 * author：libilang
 * time: 17/10/30 18:25
 * 邮箱：libi_lang@163.com
 */

public interface ProgressListener {
    /**
     * 显示进度
     *
     * @param mProgress
     */
    public void onProgress(int mProgress, long contentSize);

    /**
     * 完成状态
     *
     * @param totalSize
     */
    public void onDone(long totalSize);
}

