package PracticeJobs.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @Author Simple
 * @Create 2021/7/12 17:59
 */
public class Practice2 {


    public static void main(String[] args) throws IOException {

        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        int i = 0;


        //1. 确定要访问/爬取的URL
        URL url = new URL("https://www.oschina.net/");
        //2. 获取连接对象
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        //3. 设置连接相关信息，如请求方式、请求参数、请求头
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36");
        httpURLConnection.setConnectTimeout(30000);
        //4. 获取数据
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        String html = "";
        while ((line = bufferedReader.readLine()) != null) {
            html += line + "\n";
        }

        //System.out.println(html);
        //5. 关闭连接/资源
        inputStream.close();
        bufferedReader.close();
        httpURLConnection.disconnect();

       // Pattern p1 = Pattern.compile("(<a class=\"item-title primary  \" href=)(.*?)(>)(.*?)(</a>)");
        Pattern p2 = Pattern.compile("(<div class=\"item-extra\">)(.*?)(</div>)");
        //Matcher m1 = p1.matcher(html);
        Matcher m2 = p2.matcher(html);
//        while (m1.find() && m2.find()) {
//            str1 = m1.group(4);
//            str2 = m2.group(2);
//            System.out.println("标题： "+str1+"  时间："+str2);
//        }

        Pattern p3 = Pattern.compile("(<a class=\"item-title primary  visited  \" href=)(.*?)(>)(.*?)(</a>)");
        Matcher m3 = p3.matcher(html);
        while (m3.find() && m2.find() && i<10) {
                str3 = m3.group(4);
                str4 = m2.group(2);
                i++;
                System.out.println("标题： "+str3+"  时间："+str4);
        }



    }
}

