package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.Ej0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0757Ej0 extends C6563mc0 implements InterfaceC0436Bj0 {
    public static Method l0;
    public InterfaceC0436Bj0 k0;

    /* JADX INFO: renamed from: com.daaw.Ej0$a */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ej0$b */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ej0$c */
    public static class c extends C7858rE {
        public final int O;
        public final int P;
        public InterfaceC0436Bj0 Q;
        public MenuItem R;

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.O = 21;
                this.P = 22;
            } else {
                this.O = 22;
                this.P = 21;
            }
        }

        @Override // com.daaw.C7858rE
        public /* bridge */ /* synthetic */ int d(int i, int i2, int i3, int i4, int i5) {
            return super.d(i, i2, i3, i4, i5);
        }

        @Override // com.daaw.C7858rE
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i) {
            return super.e(motionEvent, i);
        }

        @Override // com.daaw.C7858rE, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // com.daaw.C7858rE, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // com.daaw.C7858rE, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // com.daaw.C7858rE, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // com.daaw.C7858rE, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.Q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= dVar.getCount()) ? null : dVar.getItem(i);
                MenuItem menuItem = this.R;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.Q.f(eVarB, menuItem);
                    }
                    this.R = item;
                    if (item != null) {
                        this.Q.c(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.O) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.P) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // com.daaw.C7858rE, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0436Bj0 interfaceC0436Bj0) {
            this.Q = interfaceC0436Bj0;
        }

        @Override // com.daaw.C7858rE, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                l0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public C0757Ej0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(this.g0, (Transition) obj);
        }
    }

    public void T(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(this.g0, (Transition) obj);
        }
    }

    public void U(InterfaceC0436Bj0 interfaceC0436Bj0) {
        this.k0 = interfaceC0436Bj0;
    }

    public void V(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.g0, z);
            return;
        }
        Method method = l0;
        if (method != null) {
            try {
                method.invoke(this.g0, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.daaw.InterfaceC0436Bj0
    public void c(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        InterfaceC0436Bj0 interfaceC0436Bj0 = this.k0;
        if (interfaceC0436Bj0 != null) {
            interfaceC0436Bj0.c(eVar, menuItem);
        }
    }

    @Override // com.daaw.InterfaceC0436Bj0
    public void f(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        InterfaceC0436Bj0 interfaceC0436Bj0 = this.k0;
        if (interfaceC0436Bj0 != null) {
            interfaceC0436Bj0.f(eVar, menuItem);
        }
    }

    @Override // com.daaw.C6563mc0
    public C7858rE s(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
