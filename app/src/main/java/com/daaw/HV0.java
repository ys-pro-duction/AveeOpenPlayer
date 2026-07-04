package com.daaw;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class HV0 implements InterfaceC3962dL {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final a e;
    public final b[] f;
    public final long g;
    public final long h;

    public static class a {
        public final UUID a;
        public final byte[] b;

        public a(UUID uuid, byte[] bArr) {
            this.a = uuid;
            this.b = bArr;
        }
    }

    public HV0(int i, int i2, long j, long j2, long j3, int i3, boolean z, a aVar, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : AbstractC6280lb1.T(j2, 1000000L, j), j3 != 0 ? AbstractC6280lb1.T(j3, 1000000L, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    @Override // com.daaw.InterfaceC3962dL
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final HV0 a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        new ArrayList();
        if (arrayList.size() <= 0) {
            return new HV0(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (b[]) arrayList2.toArray(new b[0]));
        }
        AbstractC6314li0.a(arrayList.get(0));
        throw null;
    }

    public static class b {
        public final int a;
        public final String b;
        public final long c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final String i;
        public final Format[] j;
        public final int k;
        public final String l;
        public final String m;
        public final List n;
        public final long[] o;
        public final long p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list, AbstractC6280lb1.U(list, 1000000L, j), AbstractC6280lb1.T(j2, 1000000L, j));
        }

        public Uri a(int i, int i2) {
            AbstractC7115ob.f(this.j != null);
            AbstractC7115ob.f(this.n != null);
            AbstractC7115ob.f(i2 < this.n.size());
            String string = Integer.toString(this.j[i].C);
            String string2 = ((Long) this.n.get(i2)).toString();
            return AbstractC0401Ba1.d(this.l, this.m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public long b(int i) {
            if (i == this.k - 1) {
                return this.p;
            }
            long[] jArr = this.o;
            return jArr[i + 1] - jArr[i];
        }

        public int c(long j) {
            return AbstractC6280lb1.e(this.o, j, true, true);
        }

        public long d(int i) {
            return this.o[i];
        }

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List list, long[] jArr, long j2) {
            this.l = str;
            this.m = str2;
            this.a = i;
            this.b = str3;
            this.c = j;
            this.d = str4;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = str5;
            this.j = formatArr;
            this.n = list;
            this.o = jArr;
            this.p = j2;
            this.k = list.size();
        }
    }

    public HV0(int i, int i2, long j, long j2, int i3, boolean z, a aVar, b[] bVarArr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = aVar;
        this.f = bVarArr;
    }
}
