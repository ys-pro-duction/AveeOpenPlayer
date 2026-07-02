package com.daaw;

import android.net.Uri;
import com.daaw.LO0;
import com.google.android.exoplayer2.Format;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6202lI0 {
    public final String a;
    public final long b;
    public final Format c;
    public final String d;
    public final long e;
    public final List f;
    public final C7859rE0 g;

    /* JADX INFO: renamed from: com.daaw.lI0$c */
    public static class c extends AbstractC6202lI0 {
        public final Uri h;
        public final long i;
        public final String j;
        public final C7859rE0 k;
        public final C8756uT0 l;

        public c(String str, long j, Format format, String str2, LO0.e eVar, List list, String str3, long j2) {
            String str4;
            super(str, j, format, str2, eVar, list);
            this.h = Uri.parse(str2);
            C7859rE0 c7859rE0C = eVar.c();
            this.k = c7859rE0C;
            if (str3 != null) {
                str4 = str3;
            } else if (str != null) {
                str4 = str + "." + format.B + "." + j;
            } else {
                str4 = null;
            }
            this.j = str4;
            this.i = j2;
            this.l = c7859rE0C == null ? new C8756uT0(new C7859rE0(null, 0L, j2)) : null;
        }

        @Override // com.daaw.AbstractC6202lI0
        public String a() {
            return this.j;
        }

        @Override // com.daaw.AbstractC6202lI0
        public InterfaceC1428Kv i() {
            return this.l;
        }

        @Override // com.daaw.AbstractC6202lI0
        public C7859rE0 j() {
            return this.k;
        }
    }

    public static AbstractC6202lI0 l(String str, long j, Format format, String str2, LO0 lo0, List list) {
        return m(str, j, format, str2, lo0, list, null);
    }

    public static AbstractC6202lI0 m(String str, long j, Format format, String str2, LO0 lo0, List list, String str3) {
        if (lo0 instanceof LO0.e) {
            return new c(str, j, format, str2, (LO0.e) lo0, list, str3, -1L);
        }
        if (lo0 instanceof LO0.a) {
            return new b(str, j, format, str2, (LO0.a) lo0, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract InterfaceC1428Kv i();

    public abstract C7859rE0 j();

    public C7859rE0 k() {
        return this.g;
    }

    public AbstractC6202lI0(String str, long j, Format format, String str2, LO0 lo0, List list) {
        this.a = str;
        this.b = j;
        this.c = format;
        this.d = str2;
        this.f = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.g = lo0.a(this);
        this.e = lo0.b();
    }

    /* JADX INFO: renamed from: com.daaw.lI0$b */
    public static class b extends AbstractC6202lI0 implements InterfaceC1428Kv {
        public final LO0.a h;

        public b(String str, long j, Format format, String str2, LO0.a aVar, List list) {
            super(str, j, format, str2, aVar, list);
            this.h = aVar;
        }

        @Override // com.daaw.AbstractC6202lI0
        public String a() {
            return null;
        }

        @Override // com.daaw.InterfaceC1428Kv
        public long b(long j) {
            return this.h.g(j);
        }

        @Override // com.daaw.InterfaceC1428Kv
        public long c(long j, long j2) {
            return this.h.e(j, j2);
        }

        @Override // com.daaw.InterfaceC1428Kv
        public C7859rE0 d(long j) {
            return this.h.h(this, j);
        }

        @Override // com.daaw.InterfaceC1428Kv
        public long e(long j, long j2) {
            return this.h.f(j, j2);
        }

        @Override // com.daaw.InterfaceC1428Kv
        public boolean f() {
            return this.h.i();
        }

        @Override // com.daaw.InterfaceC1428Kv
        public long g() {
            return this.h.c();
        }

        @Override // com.daaw.InterfaceC1428Kv
        public int h(long j) {
            return this.h.d(j);
        }

        @Override // com.daaw.AbstractC6202lI0
        public C7859rE0 j() {
            return null;
        }

        @Override // com.daaw.AbstractC6202lI0
        public InterfaceC1428Kv i() {
            return this;
        }
    }
}
