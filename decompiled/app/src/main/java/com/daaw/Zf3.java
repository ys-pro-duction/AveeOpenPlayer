package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Zf3 extends AbstractC4056dg3 {
    public /* synthetic */ Zf3(Xf3 xf3) {
        super(null);
    }

    @Override // com.daaw.AbstractC4056dg3
    public final void a(Object obj, long j) {
        ((InterfaceC9377wf3) AbstractC5750ji3.k(obj, j)).zzb();
    }

    @Override // com.daaw.AbstractC4056dg3
    public final void b(Object obj, Object obj2, long j) {
        InterfaceC9377wf3 interfaceC9377wf3F = (InterfaceC9377wf3) AbstractC5750ji3.k(obj, j);
        InterfaceC9377wf3 interfaceC9377wf3 = (InterfaceC9377wf3) AbstractC5750ji3.k(obj2, j);
        int size = interfaceC9377wf3F.size();
        int size2 = interfaceC9377wf3.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC9377wf3F.zzc()) {
                interfaceC9377wf3F = interfaceC9377wf3F.f(size2 + size);
            }
            interfaceC9377wf3F.addAll(interfaceC9377wf3);
        }
        if (size > 0) {
            interfaceC9377wf3 = interfaceC9377wf3F;
        }
        AbstractC5750ji3.x(obj, j, interfaceC9377wf3);
    }
}
