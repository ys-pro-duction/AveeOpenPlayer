package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class AC0 implements InterfaceC6540mX {
    public int a;
    public int b;

    public AC0() {
        this.a = -1;
        this.b = 0;
    }

    @Override // com.daaw.InterfaceC6540mX
    public int a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC6540mX
    public void b(int i) {
        this.b = i;
    }

    @Override // com.daaw.InterfaceC6540mX
    public int c() {
        return this.b;
    }

    public void d(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public AC0(int i) {
        this.a = -1;
        this.b = i;
    }
}
