(ns projektclojure.core
  (:gen-class))

;Program ktory przyjmie od uzytkownika wartosc liczbowa w podstawie dziesietnej
;i przekonwertuje ja na binarna, osemkowa i szesnastkowa.

(defn zamiana[]
  (println "Wpisz liczbe w postaci dziesietnej, ktora chcesz zamienic na inne systemy.")
  (let[liczba (read-line)                                   ;pod zmienna liczba podstawiamy to, co wpisze uzytkownik z klawiatury
       liczba2 (read-string liczba)]                        ;konwertujemy zmienna stringowa liczba na zmienna numeryczna liczba2
    (println "Dziesietnie:" (Integer/toString liczba2 10))
    (println "Binarnie:" (Integer/toString liczba2 2))
    (println "Osemkowo:" (Integer/toString liczba2 8))
    (println "Szesnastkowo:" (Integer/toString liczba2 16))))

(defn -main []
  (zamiana))