package com.daaw;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0908Fv implements InterfaceC3962dL {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final C3193ab1 i;
    public final Uri j;
    public final List k;

    public C0908Fv(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C3193ab1 c3193ab1, Uri uri, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = c3193ab1;
        this.j = uri;
        this.k = list == null ? Collections.EMPTY_LIST : list;
    }

    public static ArrayList c(List list, LinkedList linkedList) {
        C6481mI0 c6481mI0 = (C6481mI0) linkedList.poll();
        int i = c6481mI0.B;
        ArrayList arrayList = new ArrayList();
        do {
            int i2 = c6481mI0.C;
            W2 w2 = (W2) list.get(i2);
            List list2 = w2.c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((AbstractC6202lI0) list2.get(c6481mI0.D));
                c6481mI0 = (C6481mI0) linkedList.poll();
                if (c6481mI0.B != i) {
                    break;
                }
            } while (c6481mI0.C == i2);
            arrayList.add(new W2(w2.a, w2.b, arrayList2, w2.d, w2.e));
        } while (c6481mI0.B == i);
        linkedList.addFirst(c6481mI0);
        return arrayList;
    }

    @Override // com.daaw.InterfaceC3962dL
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0908Fv a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C6481mI0(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= e()) {
                break;
            }
            if (((C6481mI0) linkedList.peek()).B != i) {
                long jF = f(i);
                if (jF != -9223372036854775807L) {
                    j += jF;
                }
            } else {
                C1421Kt0 c1421Kt0D = d(i);
                arrayList.add(new C1421Kt0(c1421Kt0D.a, c1421Kt0D.b - j, c(c1421Kt0D.c, linkedList), c1421Kt0D.d));
            }
            i++;
        }
        long j2 = this.b;
        return new C0908Fv(this.a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, arrayList);
    }

    public final C1421Kt0 d(int i) {
        return (C1421Kt0) this.k.get(i);
    }

    public final int e() {
        return this.k.size();
    }

    public final long f(int i) {
        long j;
        long j2;
        if (i == this.k.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((C1421Kt0) this.k.get(i)).b;
        } else {
            j = ((C1421Kt0) this.k.get(i + 1)).b;
            j2 = ((C1421Kt0) this.k.get(i)).b;
        }
        return j - j2;
    }

    public final long g(int i) {
        return AbstractC6025ki.a(f(i));
    }
}
