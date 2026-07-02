package com.daaw.avee;

import com.daaw.AbstractApplicationC1804Ol0;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC6997o80;
import com.daaw.C4261eQ0;
import com.daaw.C5034h80;
import com.daaw.C5119hT;
import com.daaw.C9743xy;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.IL;
import com.daaw.NQ;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/daaw/avee/MainApp;", "Lcom/daaw/Ol0;", "<init>", "()V", "Lcom/daaw/G91;", "onCreate", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainApp extends AbstractApplicationC1804Ol0 {

    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
        }

        public final void a(C5034h80 c5034h80) throws C9743xy {
            G10.g(c5034h80, "$this$startKoin");
            AbstractC6997o80.d(c5034h80, MainApp.this);
            c5034h80.d(AbstractC1496Lm.e(C4261eQ0.a.a(MainApp.this)));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws C9743xy {
            a((C5034h80) obj);
            return G91.a;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        IL.a().c("MainApp onCreate");
        C5119hT.a.b(new a());
    }
}
