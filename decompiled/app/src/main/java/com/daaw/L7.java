package com.daaw;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class L7 implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final O90 c;
    public final O90 d;
    public final List e;

    public L7(Class cls, Map map, O90 o90, O90 o902, List list) {
        this.a = cls;
        this.b = map;
        this.c = o90;
        this.d = o902;
        this.e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return N7.o(this.a, this.b, this.c, this.d, this.e, obj, method, objArr);
    }
}
