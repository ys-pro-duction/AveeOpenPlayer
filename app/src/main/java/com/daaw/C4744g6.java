package com.daaw;

import android.graphics.Typeface;
import com.daaw.AbstractC7898rO;
import com.daaw.D7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4744g6 implements InterfaceC1105Hs0 {
    public final String a;
    public final O21 b;
    public final List c;
    public final List d;
    public final AbstractC7898rO.b e;
    public final InterfaceC4988gz f;
    public final C8101s6 g;
    public final CharSequence h;
    public final C9798y90 i;
    public final List j;
    public final int k;

    /* JADX INFO: renamed from: com.daaw.g6$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC4553fR {
        public a() {
            super(4);
        }

        public final Typeface a(AbstractC7898rO abstractC7898rO, SO so, int i, int i2) {
            G10.g(so, "fontWeight");
            Y81 y81 = new Y81(C4744g6.this.f().a(abstractC7898rO, so, i, i2));
            C4744g6.this.j.add(y81);
            return y81.a();
        }

        @Override // com.daaw.InterfaceC4553fR
        public /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((AbstractC7898rO) obj, (SO) obj2, ((PO) obj3).i(), ((QO) obj4).j());
        }
    }

    public C4744g6(String str, O21 o21, List list, List list2, AbstractC7898rO.b bVar, InterfaceC4988gz interfaceC4988gz) {
        G10.g(str, "text");
        G10.g(o21, "style");
        G10.g(list, "spanStyles");
        G10.g(list2, "placeholders");
        G10.g(bVar, "fontFamilyResolver");
        G10.g(interfaceC4988gz, "density");
        this.a = str;
        this.b = o21;
        this.c = list;
        this.d = list2;
        this.e = bVar;
        this.f = interfaceC4988gz;
        C8101s6 c8101s6 = new C8101s6(1, interfaceC4988gz.getDensity());
        this.g = c8101s6;
        this.j = new ArrayList();
        int iB = AbstractC5023h6.b(o21.x(), o21.q());
        this.k = iB;
        a aVar = new a();
        CharSequence charSequenceA = AbstractC4455f6.a(str, c8101s6.getTextSize(), o21, AbstractC2455Um.z0(AbstractC1496Lm.e(new D7.b(D21.a(c8101s6, o21.E(), aVar, interfaceC4988gz), 0, str.length())), list), list2, interfaceC4988gz, aVar);
        this.h = charSequenceA;
        this.i = new C9798y90(charSequenceA, c8101s6, iB);
    }

    @Override // com.daaw.InterfaceC1105Hs0
    public boolean a() {
        List list = this.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Y81) list.get(i)).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1105Hs0
    public float b() {
        return this.i.c();
    }

    @Override // com.daaw.InterfaceC1105Hs0
    public float c() {
        return this.i.b();
    }

    public final CharSequence e() {
        return this.h;
    }

    public final AbstractC7898rO.b f() {
        return this.e;
    }

    public final C9798y90 g() {
        return this.i;
    }

    public final O21 h() {
        return this.b;
    }

    public final int i() {
        return this.k;
    }

    public final C8101s6 j() {
        return this.g;
    }
}
