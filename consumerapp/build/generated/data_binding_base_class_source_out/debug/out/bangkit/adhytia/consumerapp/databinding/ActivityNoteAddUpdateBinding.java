// Generated by view binder compiler. Do not edit!
package bangkit.adhytia.consumerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import bangkit.adhytia.consumerapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNoteAddUpdateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final EditText edtDescription;

  @NonNull
  public final EditText edtTitle;

  private ActivityNoteAddUpdateBinding(@NonNull LinearLayout rootView, @NonNull Button btnSubmit,
      @NonNull EditText edtDescription, @NonNull EditText edtTitle) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.edtDescription = edtDescription;
    this.edtTitle = edtTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNoteAddUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNoteAddUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_note_add_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNoteAddUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_submit;
      Button btnSubmit = rootView.findViewById(id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.edt_description;
      EditText edtDescription = rootView.findViewById(id);
      if (edtDescription == null) {
        break missingId;
      }

      id = R.id.edt_title;
      EditText edtTitle = rootView.findViewById(id);
      if (edtTitle == null) {
        break missingId;
      }

      return new ActivityNoteAddUpdateBinding((LinearLayout) rootView, btnSubmit, edtDescription,
          edtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
