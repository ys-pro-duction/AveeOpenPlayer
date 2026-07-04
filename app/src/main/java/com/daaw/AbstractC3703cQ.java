package com.daaw;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: renamed from: com.daaw.cQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3703cQ extends AbstractC7480ps0 {
    public final FragmentManager c;
    public FragmentTransaction d = null;
    public Fragment e = null;

    public AbstractC3703cQ(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    public static String r(int i, long j) {
        return "android:switcher:" + i + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + j;
    }

    @Override // com.daaw.AbstractC7480ps0
    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        this.d.detach((Fragment) obj);
    }

    @Override // com.daaw.AbstractC7480ps0
    public void b(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.d;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
            this.d = null;
            this.c.executePendingTransactions();
        }
    }

    @Override // com.daaw.AbstractC7480ps0
    public Object g(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        long jQ = q(i);
        Fragment fragmentFindFragmentByTag = this.c.findFragmentByTag(r(viewGroup.getId(), jQ));
        if (fragmentFindFragmentByTag != null) {
            this.d.attach(fragmentFindFragmentByTag);
        } else {
            fragmentFindFragmentByTag = p(i);
            this.d.add(viewGroup.getId(), fragmentFindFragmentByTag, r(viewGroup.getId(), jQ));
        }
        if (fragmentFindFragmentByTag != this.e) {
            fragmentFindFragmentByTag.setMenuVisibility(false);
            NP.a(fragmentFindFragmentByTag, false);
        }
        return fragmentFindFragmentByTag;
    }

    @Override // com.daaw.AbstractC7480ps0
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // com.daaw.AbstractC7480ps0
    public Parcelable k() {
        return null;
    }

    @Override // com.daaw.AbstractC7480ps0
    public void l(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                NP.a(this.e, false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                NP.a(fragment, true);
            }
            this.e = fragment;
        }
    }

    @Override // com.daaw.AbstractC7480ps0
    public void n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment p(int i);

    public long q(int i) {
        return i;
    }

    @Override // com.daaw.AbstractC7480ps0
    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }
}
