
package com.test.wordcheck.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WordResponse {

    @SerializedName("word")
    @Expose
    private String word;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("syllables")
    @Expose
    private Syllables syllables;
    @SerializedName("pronunciation")
    @Expose
    private Pronunciation pronunciation;
    @SerializedName("frequency")
    @Expose
    private Double frequency;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Syllables getSyllables() {
        return syllables;
    }

    public void setSyllables(Syllables syllables) {
        this.syllables = syllables;
    }

    public Pronunciation getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(Pronunciation pronunciation) {
        this.pronunciation = pronunciation;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

}
