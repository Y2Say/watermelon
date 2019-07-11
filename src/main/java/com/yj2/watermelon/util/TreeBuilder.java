package com.yj2.watermelon.util;


import java.util.*;

/**
 * 区域树工具类
 */
public class TreeBuilder {

    /*public static Map<String, Object> mapArray = new LinkedHashMap<String, Object>();
    public List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
    public List<Area> menuCommon;
    public List<Map<String, Object>> menuList(List<Area> menu) {
        this.menuCommon = menu;
        if (!CollectionUtils.isEmpty(menuCommon)) {
            menuCommon.forEach(area -> {
                if ("0".equals(area.getPid())) {
                    Map<String, Object> mapArr = new HashMap<>();
                    mapArr.put("id", area.getId());
                    mapArr.put("label", area.getName());
                    mapArr.put("pid", area.getPid());
                    mapArr.put("sequ",area.getSequ());
                    mapArr.put("children", menuChild(area.getId()));
                    list.add(mapArr);
                }
            });
        }
        return list;
    }

    public List<Map<String, Object>>menuChild(String id) {
        List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
        if (!CollectionUtils.isEmpty(menuCommon)) {
            menuCommon.forEach(a -> {
                String areaPid = a.getPid();
                if (id.equals(areaPid)) {
                    Map<String, Object> childArray = new HashMap<>();
                    childArray.put("id", a.getId());
                    childArray.put("label", a.getName());
                    childArray.put("pid", a.getPid());
                    childArray.put("sequ", a.getSequ());
                    childArray.put("children", menuChild(a.getId()));
                    lists.add(childArray);
                }
            });
        }
        Collections.sort(list, new MapComparatorAsc());
        return lists;
    }*/
}

//字段排序
class MapComparatorAsc implements Comparator<Map<String, Object>> {
    @Override
    public int compare(Map<String, Object> o1,Map<String, Object> o2) {
        Double d5 = ((Double) o1.get("sequ"));
        Double d6 = (Double) o2.get("sequ");
        if (d5 != null && d6 != null) {
            return d5.compareTo(d6);
        }
        return 0;
    }
}
