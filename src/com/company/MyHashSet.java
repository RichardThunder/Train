package com.company;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

class MyHashSet {
boolean[] s=new boolean[1000005];
public MyHashSet() {

}

public void add(int key) {
    s[key]=true;
}

public void remove(int key) {
    s[key]=false;
}

public boolean contains(int key) {
    return s[key];
}
}
