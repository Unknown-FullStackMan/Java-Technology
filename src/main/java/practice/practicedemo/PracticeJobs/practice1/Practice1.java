package PracticeJobs.practice1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author Simple
 * @Create 2021/7/9 13:38
 */
public class Practice1 {
    public static void main(String[] args) {
        int[] a = new int[11];
        int index =0;
        int num =1;
        Map studentMap1 = new HashMap();
        Map studentMap2 = new HashMap();

        for (int i = 0; i < 1000; i++) {
            String name ="第"+i+"名学生";
            studentMap1.put(name,(int)(Math.random()*100));
        }
        System.out.println(Practice1.sortMapByValues(studentMap1));
        studentMap2 = Practice1.sortMapByValues(studentMap1);

        Iterator<Map.Entry<String, Integer>> entryIterator = studentMap2.entrySet().iterator();
        Map.Entry<String, Integer> first = entryIterator.next();
        int value = first.getValue();
        a[index] = value;
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
            if(next.getValue() != value){
                index++;
                a[index] = next.getValue();
                value = next.getValue();
            }
            if(index == 10)
                break;
        }

        System.out.println("分数前10是："+Arrays.toString(a));


        Iterator<Map.Entry<String, Integer>> entryIterator2 = studentMap2.entrySet().iterator();
        Map<Integer, Integer> scoreNum = new HashMap();
        while (entryIterator2.hasNext()) {
            Map.Entry<String, Integer> next1 = entryIterator2.next();
            if(next1.getValue() == value){
                num++;
                scoreNum.put(value,num);
            }
            else{
                value = next1.getValue();
                num=1;
                scoreNum.put(value,num);
            }
        }

        System.out.println("每个分数对应的学生人数:"+scoreNum);
        Map<Integer, Integer> scoreNum2 = new HashMap();
        scoreNum2= Practice1.sortMapByValues(scoreNum);
        System.out.println("按照人数排序后，每个分数对应的学生人数："+scoreNum2);

        List scoreList = new ArrayList();
        Iterator<Map.Entry<Integer, Integer>> entryIterator3 = scoreNum2.entrySet().iterator();
        Map.Entry<Integer, Integer> next = entryIterator3.next();

        for (int i = 0; i < 5; i++) {
            scoreList.add(next.getKey());
            next = entryIterator3.next();
        }
        System.out.println("学生得分相同的前5名分数是："+scoreList);


        for (int i = 0; i < 5; i++) {
            System.out.println("分数为的"+scoreList.get(i)+"学生名单： "+Practice1.getKey(studentMap2, scoreList.get(i)));
        }
    }


    /**
     * 按照Map的Value排序
     * @param aMap
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K extends Comparable, V extends Comparable> Map<K, V> sortMapByValues(Map<K, V> aMap) {
        HashMap<K, V> finalOut = new LinkedHashMap<>();
        aMap.entrySet()
                .stream()
                .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                .collect(Collectors.toList()).forEach(ele -> finalOut.put(ele.getKey(), ele.getValue()));
        return finalOut;
    }

    /**
     * 由map的Value获取对应的所有Key
     * @param map
     * @param v
     * @return
     */
    public static Object getKey(Map<String, Integer> map, Object v) {

        List keyList = new ArrayList();;
        for (Map.Entry<String, Integer> m :map.entrySet())  {
            if (m.getValue().equals(v)) {
                keyList .add(m.getKey());
            }}
        return keyList;

    }

}