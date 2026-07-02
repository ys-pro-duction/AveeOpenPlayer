package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.g;
import com.daaw.AbstractC0708Dx;
import com.daaw.AbstractC3266aq;
import com.daaw.GZ;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.S41;
import com.daaw.W9;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements GZ {

    public class a implements DefaultLifecycleObserver {
        public final /* synthetic */ g B;

        public a(g gVar) {
            this.B = gVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(InterfaceC1764Ob0 interfaceC1764Ob0) {
            AbstractC0708Dx.a(this, interfaceC1764Ob0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onDestroy(InterfaceC1764Ob0 interfaceC1764Ob0) {
            AbstractC0708Dx.b(this, interfaceC1764Ob0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(InterfaceC1764Ob0 interfaceC1764Ob0) {
            AbstractC0708Dx.c(this, interfaceC1764Ob0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC1764Ob0 interfaceC1764Ob0) {
            EmojiCompatInitializer.this.e();
            this.B.d(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(InterfaceC1764Ob0 interfaceC1764Ob0) {
            AbstractC0708Dx.d(this, interfaceC1764Ob0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(InterfaceC1764Ob0 interfaceC1764Ob0) {
            AbstractC0708Dx.e(this, interfaceC1764Ob0);
        }
    }

    public static class b extends c.AbstractC0013c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    public static class c implements c.h {
        public final Context a;

        public class a extends c.i {
            public final /* synthetic */ c.i a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = iVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.i
            public void b(f fVar) {
                try {
                    this.a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public void a(final c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = AbstractC3266aq.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: com.daaw.TF
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.c(iVar, threadPoolExecutorB);
                }
            });
        }

        public void c(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e eVarA = androidx.emoji2.text.a.a(this.a);
                if (eVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                eVarA.c(threadPoolExecutor);
                eVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                S41.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.i()) {
                    androidx.emoji2.text.c.c().l();
                }
            } finally {
                S41.b();
            }
        }
    }

    @Override // com.daaw.GZ
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.daaw.GZ
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        androidx.emoji2.text.c.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        g gVarW = ((InterfaceC1764Ob0) W9.e(context).f(ProcessLifecycleInitializer.class)).w();
        gVarW.a(new a(gVarW));
    }

    public void e() {
        AbstractC3266aq.c().postDelayed(new d(), 500L);
    }
}
