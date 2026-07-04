package com.daaw;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class O43 extends LinkedHashMap {
    public static final O43 C;
    public boolean B;

    static {
        O43 o43 = new O43();
        C = o43;
        o43.B = false;
    }

    public O43() {
        this.B = true;
    }

    public static O43 b() {
        return C;
    }

    public static int g(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC6143l43) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC8374t43.a;
        int length = bArr.length;
        int iB = AbstractC8374t43.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final O43 c() {
        return isEmpty() ? new O43() : new O43(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        super.clear();
    }

    public final void d() {
        this.B = false;
    }

    public final void e(O43 o43) {
        h();
        if (o43.isEmpty()) {
            return;
        }
        putAll(o43);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.B;
    }

    public final void h() {
        if (!this.B) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iG = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        h();
        Charset charset = AbstractC8374t43.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        h();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC8374t43.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        return super.remove(obj);
    }

    public O43(Map map) {
        super(map);
        this.B = true;
    }
}
