package com.xjd.myapplication;

public class JniUtils {

    static {
        System.loadLibrary("goodutil");
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-57");
        System.loadLibrary("swscale-4");
        System.loadLibrary("postproc-54");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avdevice-57");
    }
   public native static String withJniUtils();
    public native void playMyMedia(String url);
}