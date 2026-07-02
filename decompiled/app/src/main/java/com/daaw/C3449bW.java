package com.daaw;

import com.google.android.exoplayer2.Format;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.bW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3449bW extends AbstractC4852gW {
    public final List c;
    public final List d;
    public final List e;
    public final Format f;
    public final List g;

    /* JADX INFO: renamed from: com.daaw.bW$a */
    public static final class a {
        public final String a;
        public final Format b;

        public a(String str, Format format) {
            this.a = str;
            this.b = format;
        }

        public static a a(String str) {
            return new a(str, Format.l("0", "application/x-mpegURL", null, null, -1, 0, null));
        }
    }

    public C3449bW(String str, List list, List list2, List list3, List list4, Format format, List list5) {
        super(str, list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = DesugarCollections.unmodifiableList(list3);
        this.e = DesugarCollections.unmodifiableList(list4);
        this.f = format;
        this.g = list5 != null ? DesugarCollections.unmodifiableList(list5) : null;
    }

    public static List c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list2.size() > 0) {
                AbstractC6314li0.a(list2.get(0));
                throw null;
            }
        }
        return arrayList;
    }

    public static C3449bW d(String str) {
        List listSingletonList = Collections.singletonList(a.a(str));
        List list = Collections.EMPTY_LIST;
        return new C3449bW(null, list, listSingletonList, list, list, null, null);
    }

    @Override // com.daaw.InterfaceC3962dL
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3449bW a(List list) {
        return new C3449bW(this.a, this.b, c(this.c, 0, list), c(this.d, 1, list), c(this.e, 2, list), this.f, this.g);
    }
}
