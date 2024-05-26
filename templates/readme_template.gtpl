<h2 align="center">👋🏻 Hey ;) I'm Jonathan</h2>

<p align="center">
  <a href="https://www.linkedin.com/in/jonathan-russ-swisscom">LinkedIn</a> •
  <a href="https://twitter.com/JonathanXD12_">X (Twitter)</a> •
  <a href="https://www.threads.net/@jonathan_russ_">Threads</a> •
  <a href="https://www.reddit.com/user/JonathanXD12">Reddit</a> •
  <a href="https://www.instagram.com/jonathan_russ_">Instagram</a> •
  <a href="https://www.tiktok.com/@jonathan_russ_">TikTok</a> •
  <a href="https://www.twitch.tv/jonathanxd12_">Twitch</a>
</p>

Hallo mein Name ist Jonathan und ich bin {{ age }} Jahre alt. Aktuell bin ich im {{ apprenticeship_year }} Lehrjahr als Informatiker - Applikationsentwicklung. Ich wohne in Egg bei Einsiedeln im Kanton Schwyz. Das Programmieren fasziniert mich sehr und ich finde es spannend, was man damit alles erreichen kann. In meiner Freizeit spiele ich gerne Computer -und Konsolenspiele und treffe mich oft mit Freunden. Ausserdem höre ich häufig Musik und produziere sie auch manchmal selbst.

<img
  align="right"
  src="https://user-images.githubusercontent.com/5713670/87202985-820dcb80-c2b6-11ea-9f56-7ec461c497c3.gif"
  width="200"
/>

- 🔭 I’m currently working at Swisscom
- 🌱 I’m currently learning Nuxt
- 👯 I’m looking to collaborate with other developers & become a better person every day!
- 🤔 I’m looking for help with ...
- 💬 Ask me about programming, music, movies, star wars
- 📫 How to reach me: ...
- 😄 Pronouns: He/Him
- ⚡ Fun fact: ...

<h3>Things I work with</h3>
<p>
  <!-- WORKFLOW: BADGES -->
</p>

<details>
  <summary><h3>👷 Check out what I'm currently working on</h3></summary>
  <ul>
    {{ range recentContributions 5 }}
    <li>
      <a href="{{ .Repo.URL }}">{{ .Repo.Name }}</a> - {{ .Repo.Description }}
    </li>
    {{ end }}
  </ul>
</details>

<details>
  <summary><h3>🌱 My latest projects</h3></summary>
  <ul>
    {{ range recentRepos 5 }}
    <li><a href="{{ .URL }}">{{ .Name }}</a> - {{ .Description }}</li>
    {{ end }}
  </ul>
</details>

<details>
  <summary><h3>🔨 My recent Pull Requests</h3></summary>
  <ul>
    {{ range recentPullRequests 5 }}
    <li>
      <a href="{{ .URL }}">{{ .Title }}</a> on
      <a href="{{ .Repo.URL }}">{{ .Repo.Name }}</a>
    </li>
    {{ end }}
  </ul>
</details>

<details>
  <summary><h3>🔭 Latest releases I've contributed to</h3></summary>
  <ul>
    {{ range recentReleases 5 }}
    <li>
      <a href="{{ .URL }}">{{ .Name }}</a> [`{{ .LastRelease.TagName }}`]({{
      .LastRelease.URL }}) - {{ .Description }}
    </li>
    {{ end }}
  </ul>
</details>

<details>
  <summary><h3>⭐ Recent Stars</h3></summary>
  <ul>
    {{ range recentStars 5 }}
    <li>
      <a href="{{ .Repo.URL }}">{{ .Repo.Name }}</a> - {{ .Repo.Description }}
    </li>
    {{ end }}
  </ul>
</details>

<details>
  <summary><h3>💖 Recent followers</h3></summary>
  <ul>
    {{ range followers 5 }}
    <li><a href="{{ .URL }}">**@{{ .Login }}**</a></li>
    {{ end }}
  </ul>
</details>

<h3>This week I spent my time on:</h3>

<!--START_SECTION:waka-->

<!-- ```txt
TypeScript      7 hrs 14 mins   ████████████████░░░░░░░░░   64.03 %
JavaScript      2 hrs 56 mins   ██████▓░░░░░░░░░░░░░░░░░░   26.03 %
Other           33 mins         █▒░░░░░░░░░░░░░░░░░░░░░░░   04.98 %
JSON            25 mins         █░░░░░░░░░░░░░░░░░░░░░░░░   03.72 %
Bash            5 mins          ▒░░░░░░░░░░░░░░░░░░░░░░░░   00.80 %
``` -->

<!--END_SECTION:waka-->

![light](https://raw.githubusercontent.com/JonathanXDR/JonathanXDR/main/images/wakatime_weekly_language_stats.svg#gh-light-mode-only)
![dark](https://raw.githubusercontent.com/JonathanXDR/JonathanXDR/main/images/wakatime_weekly_language_stats_black.svg#gh-dark-mode-only)

<details>
  <summary><h3>GitHub stats</h3></summary>

  <picture>
    <source
      srcset="
        https://github-readme-stats.vercel.app/api?username=jonathanxdr&show_icons=true&show=reviews,discussions_started,discussions_answered,prs_merged,prs_merged_percentage&theme=dark#gh-light-dark-only
      "
    />
    <source
      srcset="
        https://github-readme-stats.vercel.app/api?username=jonathanxdr&show_icons=true&show=reviews,discussions_started,discussions_answered,prs_merged,prs_merged_percentage&theme=light#gh-light-mode-only
      "
    />
    <img
      src="https://github-readme-stats.vercel.app/api?username=jonathanxdr&show_icons=true&show=reviews,discussions_started,discussions_answered,prs_merged,prs_merged_percentage"
    />
  </picture>

  <picture>
    <source
      srcset="
        https://github-readme-stats.vercel.app/api/top-langs/?username=jonathanxdr&layout=compact&theme=dark#gh-light-dark-only
      "
    />
    <source
      srcset="
        https://github-readme-stats.vercel.app/api/top-langs/?username=jonathanxdr&layout=compact&theme=light#gh-light-mode-only
      "
    />
    <img
      src="https://github-readme-stats.vercel.app/api/top-langs/?username=jonathanxdr&layout=compact"
    />
  </picture>
</details>

---

<p align="center">
  This <i>README</i> file is generated <b>every 3 hours</b>!<br />Last refresh:
  Monday, 5 February, 16:01 CET<br />
</p>
