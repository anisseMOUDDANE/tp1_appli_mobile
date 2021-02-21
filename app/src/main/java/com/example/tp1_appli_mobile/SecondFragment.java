package com.example.tp1_appli_mobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.tp1_appli_mobile.R;
import com.example.tp1_appli_mobile.SecondFragmentArgs;

public class SecondFragment extends Fragment {

    private static final String RESOURCE_PACKAGE_NAME = R.class.getPackage().getName();

    public static final String TAG = "SecondFragment";
    TextView pays, capital, language, monnaie, population, superficie ;
    TextView r_capital, r_language,r_monnaie, r_population, r_superficie;
    ImageView flag;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        System.out.println("dans la seconde vue");
        super.onViewCreated(view, savedInstanceState);
        SecondFragmentArgs args = SecondFragmentArgs.fromBundle(getArguments());
        int flag_uri = 256;
        int positions;
        positions = args.getKeyChapterId();
        //traitement de l'image :
        switch(positions) {
            case 0:
                flag_uri = R.drawable.ic_flag_of_france_320px;
                break;
            case 1:
                flag_uri = R.drawable.ic_flag_of_germany_320px;
                break;
            case 2:
                flag_uri = R.drawable.ic_flag_of_spain_320px;
                break;
            case 3:
                flag_uri = R.drawable.ic_flag_of_south_africa_320px;
                break;
            case 4:
                flag_uri = R.drawable.ic_flag_of_japan_320px;
                break;
            case 5:
                flag_uri = R.drawable.ic_flag_of_the_united_states_320px;
                break;
            default:
                System.out.println("Erreur lors du chargement du drapeau");
        }

        pays = view.findViewById(R.id.CountryName);
        capital = view.findViewById(R.id.Capital);
        language = view.findViewById(R.id.Langues);
        monnaie = view.findViewById(R.id.Monnaie);
        population = view.findViewById(R.id.Population);
        superficie = view.findViewById(R.id.Superficie);

        r_capital = view.findViewById(R.id.resultCapital);
        r_language = view.findViewById(R.id.resultLangue);
        r_monnaie = view.findViewById(R.id.resultMonnaie);
        r_population = view.findViewById(R.id.resultPop);
        r_superficie = view.findViewById(R.id.resultSuperficie);

        flag = view.findViewById(R.id.imageFlag);



        //// Implementation with bundle
        // textView.setText("Info in chapter "+(getArguments().getInt("numChapter")+1));


        pays.setText(Country.countries[args.getKeyChapterId()].getName());
        r_capital.setText(Country.countries[args.getKeyChapterId()].getCapital());
        r_language.setText(Country.countries[args.getKeyChapterId()].getLanguage());
        r_monnaie.setText(Country.countries[args.getKeyChapterId()].getCurrency());
        r_population.setText(String.valueOf(Country.countries[args.getKeyChapterId()].getPopulation()));
        r_superficie.setText(String.valueOf(Country.countries[args.getKeyChapterId()].getArea()));
        flag.setImageResource(flag_uri);

        //System.out.println(Country.countries[args.getKeyChapterId()].getName());

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}