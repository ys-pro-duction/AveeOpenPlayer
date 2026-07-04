package com.daaw;

import com.daaw.AbstractC0584Cu0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ih0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1165Ih0 {

    /* JADX INFO: renamed from: com.daaw.Ih0$a */
    public static final class a implements InterfaceC1061Hh0 {
        public final int a;
        public final int b;
        public final Map c;
        public final /* synthetic */ int d;
        public final /* synthetic */ InterfaceC1269Jh0 e;
        public final /* synthetic */ NQ f;

        public a(int i, int i2, Map map, InterfaceC1269Jh0 interfaceC1269Jh0, NQ nq) {
            this.d = i;
            this.e = interfaceC1269Jh0;
            this.f = nq;
            this.a = i;
            this.b = i2;
            this.c = map;
        }

        @Override // com.daaw.InterfaceC1061Hh0
        public void a() {
            AbstractC0584Cu0.a.C0054a c0054a = AbstractC0584Cu0.a.a;
            int i = this.d;
            EnumC7560q90 layoutDirection = this.e.getLayoutDirection();
            NQ nq = this.f;
            int iH = c0054a.h();
            EnumC7560q90 enumC7560q90G = c0054a.g();
            AbstractC0584Cu0.a.c = i;
            AbstractC0584Cu0.a.b = layoutDirection;
            nq.invoke(c0054a);
            AbstractC0584Cu0.a.c = iH;
            AbstractC0584Cu0.a.b = enumC7560q90G;
        }

        @Override // com.daaw.InterfaceC1061Hh0
        public Map b() {
            return this.c;
        }

        @Override // com.daaw.InterfaceC1061Hh0
        public int getHeight() {
            return this.b;
        }

        @Override // com.daaw.InterfaceC1061Hh0
        public int getWidth() {
            return this.a;
        }
    }

    public static InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, int i, int i2, Map map, NQ nq) {
        G10.g(map, "alignmentLines");
        G10.g(nq, "placementBlock");
        return new a(i, i2, map, interfaceC1269Jh0, nq);
    }

    public static /* synthetic */ InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, int i, int i2, Map map, NQ nq, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = AbstractC1473Lg0.h();
        }
        return interfaceC1269Jh0.s(i, i2, map, nq);
    }
}
