package com.lixun.kang;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread2 extends Thread{

    private String url; //网络图片地址
    private String name; //保存的文件名

    public TestThread2(String url,String name){
        this.url=url;
        this.name=name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为："+name);
    }

    public static void main(String[] args){
        TestThread2 t1=new TestThread2("http://i1.hdslb.com/bfs/archive/f29aa0fccd25117c23bf2b356e4792fd993618d8.jpg@380w_240h_100Q_1c.webp","1.jpg");
        TestThread2 t2=new TestThread2("http://i0.hdslb.com/bfs/archive/0ae34a0c6347a0fd2ccc7f7f468d551ae4439326.jpg@380w_240h_100Q_1c.webp","2.jpg");
        TestThread2 t3=new TestThread2("http://i2.hdslb.com/bfs/archive/afbb338b833c7dde7b34ec775e627f353d137696.jpg@380w_240h_100Q_1c.webp","3.jpg");

        t1.start();
        t2.start();
        t3.start();

    }
}

//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}