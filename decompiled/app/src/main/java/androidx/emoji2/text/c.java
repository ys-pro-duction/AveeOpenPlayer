package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.daaw.AbstractC3106aG;
import com.daaw.AbstractC8621ty0;
import com.daaw.C2823Ya;
import com.daaw.C3079a91;
import com.daaw.WF;
import com.daaw.Z81;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static volatile c q;
    public final Set b;
    public final b e;
    public final h f;
    public final j g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final boolean k;
    public final int l;
    public final int m;
    public final e n;
    public final ReadWriteLock a = new ReentrantReadWriteLock();
    public volatile int c = 3;
    public final Handler d = new Handler(Looper.getMainLooper());

    public static final class a extends b {
        public volatile androidx.emoji2.text.d b;
        public volatile androidx.emoji2.text.f c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C0012a extends i {
            public C0012a() {
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th) {
                a.this.a.n(th);
            }

            @Override // androidx.emoji2.text.c.i
            public void b(androidx.emoji2.text.f fVar) {
                a.this.d(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.b
        public void a() {
            try {
                this.a.f.a(new C0012a());
            } catch (Throwable th) {
                this.a.n(th);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.c.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.h);
        }

        public void d(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = fVar;
            androidx.emoji2.text.f fVar2 = this.c;
            j jVar = this.a.g;
            e eVar = this.a.n;
            c cVar = this.a;
            this.b = new androidx.emoji2.text.d(fVar2, jVar, eVar, cVar.i, cVar.j, WF.a());
            this.a.o();
        }
    }

    public static class b {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public abstract void a();

        public abstract CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z);

        public abstract void c(EditorInfo editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0013c {
        public final h a;
        public j b;
        public boolean c;
        public boolean d;
        public int[] e;
        public Set f;
        public boolean g;
        public int h = -16711936;
        public int i = 0;
        public e j = new androidx.emoji2.text.b();

        public AbstractC0013c(h hVar) {
            AbstractC8621ty0.h(hVar, "metadataLoader cannot be null.");
            this.a = hVar;
        }

        public final h a() {
            return this.a;
        }

        public AbstractC0013c b(int i) {
            this.i = i;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.c.j
        public AbstractC3106aG a(Z81 z81) {
            return new C3079a91(z81);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i, int i2, int i3);
    }

    public static abstract class f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class g implements Runnable {
        public final List B;
        public final Throwable C;
        public final int D;

        public g(f fVar, int i) {
            this(Arrays.asList((f) AbstractC8621ty0.h(fVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.B.size();
            int i = 0;
            if (this.D != 1) {
                while (i < size) {
                    ((f) this.B.get(i)).a(this.C);
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) this.B.get(i)).b();
                    i++;
                }
            }
        }

        public g(Collection collection, int i) {
            this(collection, i, null);
        }

        public g(Collection collection, int i, Throwable th) {
            AbstractC8621ty0.h(collection, "initCallbacks cannot be null");
            this.B = new ArrayList(collection);
            this.D = i;
            this.C = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    public interface j {
        AbstractC3106aG a(Z81 z81);
    }

    public c(AbstractC0013c abstractC0013c) {
        this.h = abstractC0013c.c;
        this.i = abstractC0013c.d;
        this.j = abstractC0013c.e;
        this.k = abstractC0013c.g;
        this.l = abstractC0013c.h;
        this.f = abstractC0013c.a;
        this.m = abstractC0013c.i;
        this.n = abstractC0013c.j;
        C2823Ya c2823Ya = new C2823Ya();
        this.b = c2823Ya;
        j jVar = abstractC0013c.b;
        this.g = jVar == null ? new d() : jVar;
        Set set = abstractC0013c.f;
        if (set != null && !set.isEmpty()) {
            c2823Ya.addAll(abstractC0013c.f);
        }
        this.e = new a(this);
        m();
    }

    public static c c() {
        c cVar;
        synchronized (o) {
            cVar = q;
            AbstractC8621ty0.i(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        return androidx.emoji2.text.d.b(inputConnection, editable, i2, i3, z);
    }

    public static boolean g(Editable editable, int i2, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.c(editable, i2, keyEvent);
    }

    public static c h(AbstractC0013c abstractC0013c) {
        c cVar;
        c cVar2 = q;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (o) {
            try {
                cVar = q;
                if (cVar == null) {
                    cVar = new c(abstractC0013c);
                    q = cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static boolean i() {
        return q != null;
    }

    public int d() {
        return this.l;
    }

    public int e() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.k;
    }

    public final boolean k() {
        return e() == 1;
    }

    public void l() {
        AbstractC8621ty0.i(this.m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.a();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void m() {
        this.a.writeLock().lock();
        try {
            if (this.m == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (e() == 0) {
                this.e.a();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public void o() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i2, int i3) {
        return r(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i2, int i3, int i4) {
        return s(charSequence, i2, i3, i4, 0);
    }

    public CharSequence s(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        AbstractC8621ty0.i(k(), "Not initialized yet");
        AbstractC8621ty0.e(i2, "start cannot be negative");
        AbstractC8621ty0.e(i3, "end cannot be negative");
        AbstractC8621ty0.e(i4, "maxEmojiCount cannot be negative");
        AbstractC8621ty0.b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        AbstractC8621ty0.b(i2 <= charSequence.length(), "start should be < than charSequence length");
        AbstractC8621ty0.b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.e.b(charSequence, i2, i3, i4, i5 != 1 ? i5 != 2 ? this.h : false : true);
    }

    public void t(f fVar) {
        AbstractC8621ty0.h(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new g(fVar, this.c));
            } else {
                this.b.add(fVar);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void u(f fVar) {
        AbstractC8621ty0.h(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(fVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.c(editorInfo);
    }
}
