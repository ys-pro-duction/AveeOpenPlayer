package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.daaw.AbstractC2317Td1;
import com.daaw.C4156e2;
import com.daaw.C5554j1;
import com.daaw.Z1;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class k extends C5554j1 {
    public final RecyclerView d;
    public final a e;

    public static class a extends C5554j1 {
        public final k d;
        public Map e = new WeakHashMap();

        public a(k kVar) {
            this.d = kVar;
        }

        @Override // com.daaw.C5554j1
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            return c5554j1 != null ? c5554j1.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // com.daaw.C5554j1
        public C4156e2 b(View view) {
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            return c5554j1 != null ? c5554j1.b(view) : super.b(view);
        }

        @Override // com.daaw.C5554j1
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            if (c5554j1 != null) {
                c5554j1.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                super.g(view, z1);
                return;
            }
            this.d.d.getLayoutManager().R0(view, z1);
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            if (c5554j1 != null) {
                c5554j1.g(view, z1);
            } else {
                super.g(view, z1);
            }
        }

        @Override // com.daaw.C5554j1
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            if (c5554j1 != null) {
                c5554j1.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // com.daaw.C5554j1
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C5554j1 c5554j1 = (C5554j1) this.e.get(viewGroup);
            return c5554j1 != null ? c5554j1.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // com.daaw.C5554j1
        public boolean j(View view, int i, Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            if (c5554j1 != null) {
                if (c5554j1.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().l1(view, i, bundle);
        }

        @Override // com.daaw.C5554j1
        public void l(View view, int i) {
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            if (c5554j1 != null) {
                c5554j1.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // com.daaw.C5554j1
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C5554j1 c5554j1 = (C5554j1) this.e.get(view);
            if (c5554j1 != null) {
                c5554j1.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public C5554j1 n(View view) {
            return (C5554j1) this.e.remove(view);
        }

        public void o(View view) {
            C5554j1 c5554j1N = AbstractC2317Td1.n(view);
            if (c5554j1N == null || c5554j1N == this) {
                return;
            }
            this.e.put(view, c5554j1N);
        }
    }

    public k(RecyclerView recyclerView) {
        this.d = recyclerView;
        C5554j1 c5554j1N = n();
        if (c5554j1N == null || !(c5554j1N instanceof a)) {
            this.e = new a(this);
        } else {
            this.e = (a) c5554j1N;
        }
    }

    @Override // com.daaw.C5554j1
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().N0(accessibilityEvent);
        }
    }

    @Override // com.daaw.C5554j1
    public void g(View view, Z1 z1) {
        super.g(view, z1);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().Q0(z1);
    }

    @Override // com.daaw.C5554j1
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().j1(i, bundle);
    }

    public C5554j1 n() {
        return this.e;
    }

    public boolean o() {
        return this.d.t0();
    }
}
