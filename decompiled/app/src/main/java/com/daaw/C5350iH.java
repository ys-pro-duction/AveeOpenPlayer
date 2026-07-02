package com.daaw;

import com.daaw.C1971Qb;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.iH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5350iH {
    public static final C1971Qb.c d = C1971Qb.c.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List a;
    public final C1971Qb b;
    public final int c;

    public C5350iH(List list) {
        this(list, C1971Qb.c);
    }

    public List a() {
        return this.a;
    }

    public C1971Qb b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5350iH)) {
            return false;
        }
        C5350iH c5350iH = (C5350iH) obj;
        if (this.a.size() != c5350iH.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((SocketAddress) this.a.get(i)).equals(c5350iH.a.get(i))) {
                return false;
            }
        }
        return this.b.equals(c5350iH.b);
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        return "[" + this.a + "/" + this.b + "]";
    }

    public C5350iH(List list, C1971Qb c1971Qb) {
        AbstractC7785qy0.e(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.a = listUnmodifiableList;
        this.b = (C1971Qb) AbstractC7785qy0.o(c1971Qb, "attrs");
        this.c = listUnmodifiableList.hashCode();
    }

    public C5350iH(SocketAddress socketAddress) {
        this(socketAddress, C1971Qb.c);
    }

    public C5350iH(SocketAddress socketAddress, C1971Qb c1971Qb) {
        this(Collections.singletonList(socketAddress), c1971Qb);
    }
}
