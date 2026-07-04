package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.g;
import com.daaw.InterfaceC1764Ob0;

/* JADX INFO: loaded from: classes.dex */
public class p implements j {
    public final Object B;
    public final a.C0020a C;

    public p(Object obj) {
        this.B = obj;
        this.C = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        this.C.a(interfaceC1764Ob0, aVar, this.B);
    }
}
