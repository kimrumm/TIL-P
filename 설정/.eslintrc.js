module.exports = {
  "env": {
      "browser": true,
      "es2020": true
  },
  "extends": "eslint:recommended",
  "parserOptions": {
      "ecmaVersion": 11,
      "sourceType": "module"
  },
  "rules": {
  }
};

{
  "plugins": ["prettier"],
  "extends": ["eslint:recommended", "plugin:prettier/recommended"],
  "rules": {
    "prettier/prettier": "error"
  }
}

// .eslintrc.json
{
  "env": {
      "browser": true,
      "node": true,  // 에러 방지 위해 browswer, node 둘다 true
      "es2020": true  //2020-12-03 기준 2021은 eslint가 안되는 오류가 있다
  },
  "extends": ["eslint:recommended", "airbnb-base"], //airbnb-base 포맷 사용
  "parserOptions": {
      "ecmaVersion": 11, //es2020
      "sourceType": "module"
  },
  "rules": {
  }
  // estlintrc.json
"extends": ["eslint:recommended","airbnb-base", "plugin:prettier/recommended"],
}
