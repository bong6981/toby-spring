package springstudy.tobyspring.learningtest.template;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public Integer calSum(String filepath) throws IOException {
        LineCallback sumCallback = new LineCallback() {
            @Override
            public int doSomethingWithLine(String line, int value) {
                return value + Integer.valueOf(line);
            }
        };
        return lineReadTemplate(filepath, sumCallback, 0);
    }

    public int calcMultiply(String filepath) throws IOException {
        LineCallback sumCallback = new LineCallback() {
            @Override
            public int doSomethingWithLine(String line, int value) {
                return value * Integer.valueOf(line);
            }
        };
        return lineReadTemplate(filepath, sumCallback, 1);
    }

    public Integer fileReadTemplate(String filepath, BufferedReaderCallback callback) throws IOException{
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filepath));
            int ret = callback.doSomethingWithReader(br);
            return ret;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Integer lineReadTemplate(String filepath, LineCallback callback, int initVal) throws IOException{
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filepath));
            int res = initVal;
            String line = null;
            while((line = br.readLine()) != null) {
                res = callback.doSomethingWithLine(line, res);
            }
            return res;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
