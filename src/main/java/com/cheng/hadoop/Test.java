package com.cheng.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapreduce.Job;

import java.io.IOException;

/**
 * @Author :cheng
 * @Description:
 * @Date: created in 12:32 2018/10/19
 * @Reference:
 */
public class Test {

    public static void main(String[] args) throws IOException {

        Job job = new Job(new Configuration());
    }


}