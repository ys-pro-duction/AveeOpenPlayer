package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class ST2 implements Runnable {
    public final /* synthetic */ U83 B;
    public final /* synthetic */ C9327wU2 C;

    public ST2(C9327wU2 c9327wU2, U83 u83) {
        this.C = c9327wU2;
        this.B = u83;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9327wU2.b(this.C, this.B);
        this.C.i(this.B.g);
    }
}
