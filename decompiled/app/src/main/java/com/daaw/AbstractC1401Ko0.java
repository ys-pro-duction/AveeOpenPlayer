package com.daaw;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Ko0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1401Ko0 {

    /* JADX INFO: renamed from: com.daaw.Ko0$a */
    public static class a {
        public final Bundle a;
        public IconCompat b;
        public final LG0[] c;
        public final LG0[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;
        public int i;
        public CharSequence j;
        public PendingIntent k;
        public boolean l;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.b(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.b(null, "", i);
            }
            return this.b;
        }

        public LG0[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, LG0[] lg0Arr, LG0[] lg0Arr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.f() == 2) {
                this.i = iconCompat.d();
            }
            this.j = d.d(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = lg0Arr;
            this.d = lg0Arr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ko0$b */
    public static class b extends e {
        public CharSequence e;

        @Override // com.daaw.AbstractC1401Ko0.e
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // com.daaw.AbstractC1401Ko0.e
        public void b(InterfaceC1297Jo0 interfaceC1297Jo0) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC1297Jo0.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigTextStyleBigText.setSummaryText(this.c);
            }
        }

        @Override // com.daaw.AbstractC1401Ko0.e
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.e = d.d(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ko0$c */
    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ko0$e */
    public static abstract class e {
        public d a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(InterfaceC1297Jo0 interfaceC1297Jo0);

        public abstract String c();

        public RemoteViews d(InterfaceC1297Jo0 interfaceC1297Jo0) {
            return null;
        }

        public RemoteViews e(InterfaceC1297Jo0 interfaceC1297Jo0) {
            return null;
        }

        public RemoteViews f(InterfaceC1297Jo0 interfaceC1297Jo0) {
            return null;
        }

        public void g(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.o(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    /* JADX INFO: renamed from: com.daaw.Ko0$d */
    public static class d {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public long N;
        public int O;
        public int P;
        public boolean Q;
        public Notification R;
        public boolean S;
        public Object T;
        public ArrayList U;
        public Context a;
        public ArrayList b;
        public ArrayList c;
        public ArrayList d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public IconCompat j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;
        public e p;
        public CharSequence q;
        public CharSequence r;
        public CharSequence[] s;
        public int t;
        public int u;
        public boolean v;
        public String w;
        public boolean x;
        public String y;
        public boolean z;

        public d(Context context, String str) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public d a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new C1505Lo0(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d e(boolean z) {
            k(16, z);
            return this;
        }

        public d f(String str) {
            this.K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public d j(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public final void k(int i, boolean z) {
            if (z) {
                Notification notification = this.R;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.R;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public d l(boolean z) {
            this.z = z;
            return this;
        }

        public d m(int i) {
            this.m = i;
            return this;
        }

        public d n(int i) {
            this.R.icon = i;
            return this;
        }

        public d o(e eVar) {
            if (this.p != eVar) {
                this.p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d p(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public d q(long j) {
            this.R.when = j;
            return this;
        }

        public d(Context context) {
            this(context, null);
        }
    }
}
