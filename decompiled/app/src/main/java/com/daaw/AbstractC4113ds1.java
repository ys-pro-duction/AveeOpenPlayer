package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.ds1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4113ds1 {
    public static InterfaceC1637Mv1 a(InterfaceC7486pt1 interfaceC7486pt1, InterfaceC1637Mv1 interfaceC1637Mv1, ES2 es2, List list) {
        if (interfaceC7486pt1.zzt(interfaceC1637Mv1.zzi())) {
            InterfaceC1637Mv1 interfaceC1637Mv1E = interfaceC7486pt1.e(interfaceC1637Mv1.zzi());
            if (interfaceC1637Mv1E instanceof AbstractC9435wr1) {
                return ((AbstractC9435wr1) interfaceC1637Mv1E).a(es2, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC1637Mv1.zzi()));
        }
        if (!"hasOwnProperty".equals(interfaceC1637Mv1.zzi())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC1637Mv1.zzi()));
        }
        AbstractC7831r73.h("hasOwnProperty", 1, list);
        return interfaceC7486pt1.zzt(es2.b((InterfaceC1637Mv1) list.get(0)).zzi()) ? InterfaceC1637Mv1.y : InterfaceC1637Mv1.z;
    }

    public static Iterator b(Map map) {
        return new C1314Js1(map.keySet().iterator());
    }
}
