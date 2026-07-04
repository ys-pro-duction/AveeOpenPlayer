package com.daaw;

import com.daaw.InterfaceC2536Vg0;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.daaw.Wg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2640Wg0 implements InterfaceC2536Vg0 {
    public final Matcher a;
    public final CharSequence b;
    public final InterfaceC2432Ug0 c;
    public List d;

    /* JADX INFO: renamed from: com.daaw.Wg0$a */
    public static final class a extends J {
        public a() {
        }

        public /* bridge */ int D(String str) {
            return super.lastIndexOf(str);
        }

        @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return s((String) obj);
            }
            return false;
        }

        @Override // com.daaw.AbstractC9193w
        public int e() {
            return C2640Wg0.this.d().groupCount() + 1;
        }

        @Override // com.daaw.J, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return y((String) obj);
            }
            return -1;
        }

        @Override // com.daaw.J, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return D((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean s(String str) {
            return super.contains(str);
        }

        @Override // com.daaw.J, java.util.List
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            String strGroup = C2640Wg0.this.d().group(i);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int y(String str) {
            return super.indexOf(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Wg0$b */
    public static final class b extends AbstractC9193w implements InterfaceC2432Ug0 {

        /* JADX INFO: renamed from: com.daaw.Wg0$b$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public a() {
                super(1);
            }

            public final C2328Tg0 a(int i) {
                return b.this.w(i);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        public b() {
        }

        @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C2328Tg0) {
                return s((C2328Tg0) obj);
            }
            return false;
        }

        @Override // com.daaw.AbstractC9193w
        public int e() {
            return C2640Wg0.this.d().groupCount() + 1;
        }

        @Override // com.daaw.AbstractC9193w, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return UP0.t(AbstractC2455Um.V(AbstractC1599Mm.l(this)), new a()).iterator();
        }

        public /* bridge */ boolean s(C2328Tg0 c2328Tg0) {
            return super.contains(c2328Tg0);
        }

        public C2328Tg0 w(int i) {
            H00 h00D = AbstractC8425tG0.d(C2640Wg0.this.d(), i);
            if (h00D.E().intValue() < 0) {
                return null;
            }
            String strGroup = C2640Wg0.this.d().group(i);
            G10.f(strGroup, "group(...)");
            return new C2328Tg0(strGroup, h00D);
        }
    }

    public C2640Wg0(Matcher matcher, CharSequence charSequence) {
        G10.g(matcher, "matcher");
        G10.g(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new b();
    }

    @Override // com.daaw.InterfaceC2536Vg0
    public InterfaceC2536Vg0.b a() {
        return InterfaceC2536Vg0.a.a(this);
    }

    @Override // com.daaw.InterfaceC2536Vg0
    public List b() {
        if (this.d == null) {
            this.d = new a();
        }
        List list = this.d;
        G10.d(list);
        return list;
    }

    public final MatchResult d() {
        return this.a;
    }
}
