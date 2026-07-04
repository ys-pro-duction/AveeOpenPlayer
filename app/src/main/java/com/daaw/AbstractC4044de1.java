package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.de1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4044de1 {

    /* JADX INFO: renamed from: com.daaw.de1$a */
    public static final class a implements KP0 {
        public final /* synthetic */ ViewGroup a;

        public a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // com.daaw.KP0
        public Iterator iterator() {
            return AbstractC4044de1.c(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.de1$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            KP0 kp0A;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (kp0A = AbstractC4044de1.a(viewGroup)) == null) {
                return null;
            }
            return kp0A.iterator();
        }
    }

    /* JADX INFO: renamed from: com.daaw.de1$c */
    public static final class c implements Iterator, InterfaceC9783y60 {
        public int B;
        public final /* synthetic */ ViewGroup C;

        public c(ViewGroup viewGroup) {
            this.C = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.C;
            int i = this.B;
            this.B = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B < this.C.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.C;
            int i = this.B - 1;
            this.B = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.de1$d */
    public static final class d implements KP0 {
        public final /* synthetic */ ViewGroup a;

        public d(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // com.daaw.KP0
        public Iterator iterator() {
            return new U51(AbstractC4044de1.a(this.a).iterator(), b.B);
        }
    }

    public static final KP0 a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final KP0 b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
