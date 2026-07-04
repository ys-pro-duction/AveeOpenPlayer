package com.daaw;

import com.daaw.InterfaceC8843um;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1224Iw {
    public static final C4735g40 c = C4735g40.e(',');
    public static final C1224Iw d = a().f(new InterfaceC8843um.a(), true).f(InterfaceC8843um.b.a, false);
    public final Map a;
    public final byte[] b;

    /* JADX INFO: renamed from: com.daaw.Iw$a */
    public static final class a {
        public final InterfaceC1120Hw a;
        public final boolean b;

        public a(InterfaceC1120Hw interfaceC1120Hw, boolean z) {
            this.a = (InterfaceC1120Hw) AbstractC7785qy0.o(interfaceC1120Hw, "decompressor");
            this.b = z;
        }
    }

    public C1224Iw(InterfaceC1120Hw interfaceC1120Hw, boolean z, C1224Iw c1224Iw) {
        String strA = interfaceC1120Hw.a();
        AbstractC7785qy0.e(!strA.contains(","), "Comma is currently not allowed in message encoding");
        int size = c1224Iw.a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1224Iw.a.containsKey(interfaceC1120Hw.a()) ? size : size + 1);
        for (a aVar : c1224Iw.a.values()) {
            String strA2 = aVar.a.a();
            if (!strA2.equals(strA)) {
                linkedHashMap.put(strA2, new a(aVar.a, aVar.b));
            }
        }
        linkedHashMap.put(strA, new a(interfaceC1120Hw, z));
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.b = c.c(b()).getBytes(Charset.forName("US-ASCII"));
    }

    public static C1224Iw a() {
        return new C1224Iw();
    }

    public static C1224Iw c() {
        return d;
    }

    public Set b() {
        HashSet hashSet = new HashSet(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            if (((a) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    public byte[] d() {
        return this.b;
    }

    public InterfaceC1120Hw e(String str) {
        a aVar = (a) this.a.get(str);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public C1224Iw f(InterfaceC1120Hw interfaceC1120Hw, boolean z) {
        return new C1224Iw(interfaceC1120Hw, z, this);
    }

    public C1224Iw() {
        this.a = new LinkedHashMap(0);
        this.b = new byte[0];
    }
}
