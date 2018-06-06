package com.learning.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class IteratorClass
{
    public static void main(String args[]){


       IteratorClass ic = new IteratorClass();
       ic.arrayListIterator();
       ic.treeSetIterator();
       ic.hashmapIteratorKeyset();
       ic.hashmapIteratorEntrySet();
    }

    public void arrayListIterator()
    {
       List<Object> al = new ArrayList<Object>();
       al.add("Ram");
       al.add("Laxman");
       al.add("Sita");
       al.add(0, "Raghuveer");
       Iterator<Object> ial = al.iterator();
       while(ial.hasNext())
       {
         System.out.println("This is list items :: "+ial.next());

       }

    }

    public void treeSetIterator()
    {
       Set<Object> al = new TreeSet<Object>();
       al.add("Ram in Set");
       al.add("Laxman in Set");
       al.add("Sita in set");
       al.add("Ram in Set");
       Iterator<Object> ial = al.iterator();
       while(ial.hasNext())
       {
         System.out.println("This is Set items :: "+ial.next());

       }

    }

    public void hashmapIteratorKeyset()
    {
       Map<Object, Object> al = new HashMap<Object, Object>();
       al.put(1, "Ram in Map");
       al.put(2,"Laxman in Map");
       al.put(3,"Sita in Map");
       al.put(4,"Ram in Map");
       al.put(2, "Laxman is replaced in Map");
       Iterator<Object> ial = al.keySet().iterator();
       while(ial.hasNext())
       {
         System.out.println("This is Map items :: "+al.get(ial.next()));

       }

    }

    public void hashmapIteratorEntrySet()
    {
       Map<Object, Object> al = new HashMap<Object, Object>();
       al.put(1, "Ram in Map");
       al.put(2,"Laxman in Map");
       al.put(3,"Sita in Map");
       al.put(4,"Ram in Map");
       al.put(2, "Laxman is replaced in Map");
       Iterator<Entry<Object, Object>> ial = al.entrySet().iterator();
       while(ial.hasNext())
       {
          Entry<Object, Object> eset =ial.next();
          System.out.println("This is Map by entry set  :: "+eset);
          System.out.println("This is Map key by entry set  :: "+eset.getKey());
         System.out.println("This is Map value by entry set  :: "+eset.getValue());

       }

    }




}
