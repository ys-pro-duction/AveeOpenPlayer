package androidx.lifecycle;

import androidx.lifecycle.g;
import com.daaw.G10;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.VM0;

/* JADX INFO: loaded from: classes.dex */
public final class s implements j {
    public final VM0 B;

    public s(VM0 vm0) {
        G10.g(vm0, "provider");
        this.B = vm0;
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(interfaceC1764Ob0, "source");
        G10.g(aVar, "event");
        if (aVar == g.a.ON_CREATE) {
            interfaceC1764Ob0.w().d(this);
            this.B.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
