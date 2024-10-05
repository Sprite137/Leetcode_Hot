/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/29 19:45
 */

import java.util.*;

public class JS_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
        Map<String, Set<String>> mapArea = new HashMap<>();
        Map<String,String> mapIndex = new HashMap<>();

        while (k-- > 0) {
            String temp = in.next();
            int x1 = in.nextInt()-1, y1 = in.nextInt()-1;
            boolean conflict = false;
            String conflictName = "";
            // 查看是否放入时冲突
            for(String tempS : mapArea.keySet()){
                if(mapArea.get(tempS).contains(Arrays.toString(new int[]{x1, y1}))){
                    conflict = true;
                    conflictName = tempS;
                    break;
                }
            }
            // 没有冲突
            if(!conflict){
                List<String> tempList = new ArrayList<>();
                tempList.add(Arrays.toString(new int[]{x1, y1}));
                mapArea.put(temp, new HashSet<>(tempList));
                mapIndex.put(temp, Arrays.toString(new int[]{x1, y1}));
            }
            // 冲突了
            else {
                // 放入的大
                if(temp.compareTo(conflictName) >0){
                    List<String> tempList = new ArrayList<>();
                    tempList.add(Arrays.toString(new int[]{x1, y1}));
                    mapArea.put(temp, new HashSet<>(tempList));
                    mapIndex.put(temp, Arrays.toString(new int[]{x1, y1}));
                    mapArea.remove(conflictName);
                    mapIndex.remove(conflictName);
                }
            }

        }

        int q = in.nextInt();
        while (q-- > 0) {
            String temp = in.next();
            String choice = in.next();
            if(!mapIndex.containsKey(temp)){
                System.out.println("unexisted empire.");
                continue;
            }
            int tempX = Integer.parseInt(mapIndex.get(temp).split(",")[0].substring(1));
            int tempY = Integer.parseInt(mapIndex.get(temp).split(",")[1].substring(1,mapIndex.get(temp).split(",")[1].length()-1));


            switch (choice){
                case "D":
                    tempY+=1;
                    break;
                case "A":
                    tempY-=1;
                    break;
                case "W":
                    tempX-=1;
                    break;
                case "S":
                    tempX+=1;
                    break;

            }
            if(tempX <0 || tempY < 0 || tempX >=n || tempY >=m){
                System.out.println("out of bounds!");
                continue;
            }

            boolean noConflict = true;
            String conflictName = "";
            for(String s: mapArea.keySet()){
                if(mapArea.get(s).contains(Arrays.toString(new int[]{tempX,tempY}))){
                    noConflict = false;
                    conflictName = s;
                    break;
                }

            }
            // 没有冲突
            if(noConflict){
                System.out.println("vanquish!");
                mapIndex.put(temp, Arrays.toString(new int[]{tempX, tempY}));
                Set<String> tempList = mapArea.get(temp);
                tempList.add(Arrays.toString(new int[]{tempX, tempY}));
                mapArea.put(temp,tempList);

            }
            else {
                if(conflictName.equals(temp)){
                    System.out.println("peaceful.");
                    mapIndex.put(temp, Arrays.toString(new int[]{tempX, tempY}));
                }
                else {
                    // a面积> b
                    if(mapArea.get(temp).size() > mapArea.get(conflictName).size()){
                        Set<String> tempSet = mapArea.get(temp);
                        tempSet.addAll(mapArea.get(conflictName));
                        mapArea.put(temp,tempSet);
                        mapArea.remove(conflictName);
                        mapIndex.remove(conflictName);
                        mapIndex.put(temp, Arrays.toString(new int[]{tempX, tempY}));
                        System.out.println(temp+" wins!");
                    }
                    // a面积< b
                    else if(mapArea.get(temp).size() < mapArea.get(conflictName).size()){
                        Set<String> tempSet = mapArea.get(conflictName);
                        tempSet.addAll(mapArea.get(temp));
                        mapArea.put(conflictName,tempSet);
                        mapArea.remove(temp);
                        mapIndex.remove(temp);
                        System.out.println(conflictName+" wins!");
                    }
                    //  a> b
                    else if(temp.compareTo(conflictName) >0){
                        Set<String> tempSet = mapArea.get(temp);
                        tempSet.addAll(mapArea.get(conflictName));
                        mapArea.put(temp,tempSet);
                        mapArea.remove(conflictName);
                        mapIndex.remove(conflictName);
                        mapIndex.put(temp, Arrays.toString(new int[]{tempX, tempY}));
                        System.out.println(temp+" wins!");
                    }
                    // a< b
                    else {
                        Set<String> tempSet = mapArea.get(conflictName);
                        tempSet.addAll(mapArea.get(temp));
                        mapArea.put(conflictName,tempSet);
                        mapArea.remove(temp);
                        mapIndex.remove(temp);
                        System.out.println(conflictName+" wins!");
                    }
                }

            }


        }
    }
}
