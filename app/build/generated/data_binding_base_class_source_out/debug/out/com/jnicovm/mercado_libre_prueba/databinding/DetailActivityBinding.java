// Generated by view binder compiler. Do not edit!
package com.jnicovm.mercado_libre_prueba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.jnicovm.mercado_libre_prueba.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DetailActivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ConstraintLayout clItemDescripcion;

  @NonNull
  public final AppCompatImageView ivItem;

  @NonNull
  public final TextView labelInformacionVendedor;

  @NonNull
  public final TextView labelReputacionVendedor;

  @NonNull
  public final TextView labelUbicacioon;

  @NonNull
  public final TextView labelVendedor;

  @NonNull
  public final TextView tvCondicion;

  @NonNull
  public final TextView tvDisponibles;

  @NonNull
  public final TextView tvEnvio;

  @NonNull
  public final TextView tvNombreItem;

  @NonNull
  public final TextView tvPrecioItem;

  @NonNull
  public final TextView tvReputacionVendedor;

  @NonNull
  public final TextView tvUbicacion;

  @NonNull
  public final TextView tvVendedor;

  @NonNull
  public final TextView tvVendidos;

  @NonNull
  public final View vSeparador1;

  private DetailActivityBinding(@NonNull LinearLayout rootView,
      @NonNull ConstraintLayout clItemDescripcion, @NonNull AppCompatImageView ivItem,
      @NonNull TextView labelInformacionVendedor, @NonNull TextView labelReputacionVendedor,
      @NonNull TextView labelUbicacioon, @NonNull TextView labelVendedor,
      @NonNull TextView tvCondicion, @NonNull TextView tvDisponibles, @NonNull TextView tvEnvio,
      @NonNull TextView tvNombreItem, @NonNull TextView tvPrecioItem,
      @NonNull TextView tvReputacionVendedor, @NonNull TextView tvUbicacion,
      @NonNull TextView tvVendedor, @NonNull TextView tvVendidos, @NonNull View vSeparador1) {
    this.rootView = rootView;
    this.clItemDescripcion = clItemDescripcion;
    this.ivItem = ivItem;
    this.labelInformacionVendedor = labelInformacionVendedor;
    this.labelReputacionVendedor = labelReputacionVendedor;
    this.labelUbicacioon = labelUbicacioon;
    this.labelVendedor = labelVendedor;
    this.tvCondicion = tvCondicion;
    this.tvDisponibles = tvDisponibles;
    this.tvEnvio = tvEnvio;
    this.tvNombreItem = tvNombreItem;
    this.tvPrecioItem = tvPrecioItem;
    this.tvReputacionVendedor = tvReputacionVendedor;
    this.tvUbicacion = tvUbicacion;
    this.tvVendedor = tvVendedor;
    this.tvVendidos = tvVendidos;
    this.vSeparador1 = vSeparador1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DetailActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DetailActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.detail_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DetailActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clItemDescripcion;
      ConstraintLayout clItemDescripcion = rootView.findViewById(id);
      if (clItemDescripcion == null) {
        break missingId;
      }

      id = R.id.ivItem;
      AppCompatImageView ivItem = rootView.findViewById(id);
      if (ivItem == null) {
        break missingId;
      }

      id = R.id.labelInformacionVendedor;
      TextView labelInformacionVendedor = rootView.findViewById(id);
      if (labelInformacionVendedor == null) {
        break missingId;
      }

      id = R.id.labelReputacionVendedor;
      TextView labelReputacionVendedor = rootView.findViewById(id);
      if (labelReputacionVendedor == null) {
        break missingId;
      }

      id = R.id.labelUbicacioon;
      TextView labelUbicacioon = rootView.findViewById(id);
      if (labelUbicacioon == null) {
        break missingId;
      }

      id = R.id.labelVendedor;
      TextView labelVendedor = rootView.findViewById(id);
      if (labelVendedor == null) {
        break missingId;
      }

      id = R.id.tvCondicion;
      TextView tvCondicion = rootView.findViewById(id);
      if (tvCondicion == null) {
        break missingId;
      }

      id = R.id.tvDisponibles;
      TextView tvDisponibles = rootView.findViewById(id);
      if (tvDisponibles == null) {
        break missingId;
      }

      id = R.id.tvEnvio;
      TextView tvEnvio = rootView.findViewById(id);
      if (tvEnvio == null) {
        break missingId;
      }

      id = R.id.tvNombreItem;
      TextView tvNombreItem = rootView.findViewById(id);
      if (tvNombreItem == null) {
        break missingId;
      }

      id = R.id.tvPrecioItem;
      TextView tvPrecioItem = rootView.findViewById(id);
      if (tvPrecioItem == null) {
        break missingId;
      }

      id = R.id.tvReputacionVendedor;
      TextView tvReputacionVendedor = rootView.findViewById(id);
      if (tvReputacionVendedor == null) {
        break missingId;
      }

      id = R.id.tvUbicacion;
      TextView tvUbicacion = rootView.findViewById(id);
      if (tvUbicacion == null) {
        break missingId;
      }

      id = R.id.tvVendedor;
      TextView tvVendedor = rootView.findViewById(id);
      if (tvVendedor == null) {
        break missingId;
      }

      id = R.id.tvVendidos;
      TextView tvVendidos = rootView.findViewById(id);
      if (tvVendidos == null) {
        break missingId;
      }

      id = R.id.v_separador_1;
      View vSeparador1 = rootView.findViewById(id);
      if (vSeparador1 == null) {
        break missingId;
      }

      return new DetailActivityBinding((LinearLayout) rootView, clItemDescripcion, ivItem,
          labelInformacionVendedor, labelReputacionVendedor, labelUbicacioon, labelVendedor,
          tvCondicion, tvDisponibles, tvEnvio, tvNombreItem, tvPrecioItem, tvReputacionVendedor,
          tvUbicacion, tvVendedor, tvVendidos, vSeparador1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
