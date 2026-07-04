package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC2621Wb1 implements Runnable {
    public b B;
    public a C;
    public volatile Object D = null;
    public volatile boolean E = false;

    /* JADX INFO: renamed from: com.daaw.Wb1$a */
    public interface a {
        void onResult(Object obj);
    }

    /* JADX INFO: renamed from: com.daaw.Wb1$b */
    public interface b {
        Object a();
    }

    public RunnableC2621Wb1(b bVar) {
        this.B = bVar;
    }

    public void a(a aVar) {
        AsyncTaskC2517Vb1.j.execute(this);
        this.C = aVar;
    }

    public Object b() {
        return this.D;
    }

    public boolean c() {
        return this.E;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.D = this.B.a();
        this.E = true;
        a aVar = this.C;
        if (aVar != null) {
            aVar.onResult(this.D);
        }
    }
}
