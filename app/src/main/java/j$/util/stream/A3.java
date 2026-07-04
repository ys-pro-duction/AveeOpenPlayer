package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class A3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ A3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c;
                try {
                    ((Runnable) this.b).run();
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    try {
                        runnable.run();
                        break;
                    } catch (Throwable th2) {
                        try {
                            th.addSuppressed(th2);
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                Stream stream = (Stream) this.c;
                try {
                    ((Stream) this.b).close();
                    stream.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        stream.close();
                        break;
                    } catch (Throwable th4) {
                        try {
                            th3.addSuppressed(th4);
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
