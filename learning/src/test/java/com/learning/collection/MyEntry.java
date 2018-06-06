package com.learning.collection;

import java.util.Map.Entry;

public class MyEntry<K, V> implements Entry<K, V>
{
     K key;
     V value;

   public MyEntry(K key, V value)
   {
     this.key=key;
     this.value=value;
   }
   @Override
   public K getKey()
   {
      // TODO Auto-generated method stub
      return key;
   }
   @Override
   public V getValue()
   {
      // TODO Auto-generated method stub
      return value;
   }
   @Override
   public V setValue(V value)
   {
      V old = this.value;
      this.value=value;
      return old;
   }

   @Override
   public String toString()
   {
      // TODO Auto-generated method stub
      return getKey()+" : "+getValue();
   }


}
